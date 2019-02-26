/* 
Working with dates and times without the proper tools can be a chore. Fortunately, Java
has three classes that handle most of the work for you. The java.util.Date class en‐
capsulates a point in time. The java.util.GregorianCalendar class, which extends the
abstract java.util.Calendar, translates between a point in time and calendar fields
like month, day, and year. Finally, the java.text.DateFormat class knows how to gen‐
erate and parse string representations of dates and times in many languages.
*/

/* The default GregorianCalendar constructor creates a calendar initialized to the current
time, in the current time zone: */
 GregorianCalendar now = new GregorianCalendar();
/* However, more generally we can just ask the Calendar class for an appropriate calendar
instance without worrying about what type of calendar system the world is using this
century: */
 Calendar now = Calendar.getInstance();

/* In either case, all the real work is done through the main set() and get() methods of
Calendar. These methods use static identifiers to refer to calendar fields and values. For
example: */
 Calendar birthday = Calendar.getInstance();
 birthday.set( Calendar.YEAR, 1972 );
 birthday.set( Calendar.MONTH, Calendar.MAY );
 birthday.set( Calendar.DATE, 20 );

/* Here, we set the year, month, and day values on the calendar, altering the internal Date
of the Calendar object. Any remaining fields that we did not set are left as they were
initialized (to the current date and time when it was constructed). In this case, we did
not really specify a full date and time; we simply overrode individual fields in the
calendar.
The Calendar class contains identifiers for all of the standard date and time fields, as
well as values such as days of the week and months of the year. The following are the
most common identifiers:
• YEAR, MONTH
• WEEK_OF_YEAR, WEEK_OF_MONTH
• DATE, DAY_OF_YEAR, DAY_OF_MONTH, DAY_OF_WEEK
• HOUR, HOUR_OF_DAY, AM_PM
• MINUTE, SECOND, MILLISECOND
• ZONE_OFFSET, DST_OFFSET
DATE and DAY_OF_MONTH are synonymous. HOUR is a 12-hour clock that can be combined
with AM_PM. The values are just what you would expect, as shown in the following:
• SUNDAY, MONDAY, TUESDAY...
• JANUARY, FEBRUARY, MARCH...
• AM, PM */

/* In addition to the set() method for changing field values, the Calendar class has two
additional methods for performing date math, add() and roll(). Using add(), you can
move a calendar forward or backward in any unit of time easily, without having to
calculate the other fields. For example, we can move our calendar forward four weeks:
 Calendar cal = Calendar.getInstance(); */
 System.out.println( cal.getTime() );
 // Thu Nov 04 16:39:06 CST 2004

 cal.add( Calendar.WEEK_OF_YEAR, 4 );
 System.out.println( cal.getTime() );
 // Thu Dec 02 16:39:06 CST 2004

/* The roll() method, by contrast, does not alter the other fields of the calendar, but
arbitrarily adjusts individual fields. See the Spinner example in Chapter 17 for addi‐
tional information about adding and subtracting time periods using the add() method.
Finally, you can always get the internal Date of the Calendar object or reinitialize the
calendar to a specific Date using the getTime() and setTime() method: */
 // Get the absolute time the Calendar references
 Date date = calendar.getTime();

 // Reinitialize this calendar to the current date and time
 Date now = new Date();
 calendar.setTime( now );
