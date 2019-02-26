/* An instance of the TimeZone class represents a time zone and the knowledge of daylight
savings time at that location. You can construct a time zone from a string specifier in a
number of ways. The most general approach is to use an offset from GMT, but many
human-readable formats are included. (For a list, use TimeZone.getAvailableIDs().)
 TimeZone.getTimeZone("US/Central"); // CST
 TimeZone.getTimeZone("GMT-06"); // CST
 TimeZone.getTimeZone("America/Chicago"); // CST
A Calendar inherits the default time zone from the platform on which it was created.
You can set a different time zone with the setTimeZone() method: */
 GregorianCalendar smokey = new
 GregorianCalendar();
 smokey.setTimeZone( TimeZone.getTimeZone("US/Mountain") );

/* It’s important to think about dates and time zones in the right way. Remember that a
Date is an absolute point in time, while a Calendar translates that Date into localized
fields that may depend on where you are. In a sense, it is meaningless to talk about the
date “Nov 1, 2004,” without specifying a time zone because at any given moment on
earth, “now” could be one of two different calendar days. Even specifying a date and
time such as “Nov 1, 2004, 9:01 pm” is ambiguous, because that particular combination
of calendar and time fields occurs at 24 separate times over the span of a day as the world
turns. Only a complete date, time, and time zone specifies an absolute
point in time, such as “Nov 1, 2004, 9:01 pm EST.” So it’s important to remember that
the Calendar class defaults all of these fields for you even if you haven’t set them. */

/* The following example prints the day of the week for the same Date object in two dif‐
ferent time zones: */
 Date date = new Date(); // point in time

 TimeZone CST = TimeZone.getTimeZone( "America/Chicago" );
 Calendar usa = Calendar.getInstance( CST );
 usa.setTime( date );
 System.out.println( usa.get( Calendar.DAY_OF_WEEK ) ); // 1

 TimeZone GMT8 = TimeZone.getTimeZone( "GMT+08"); // Beijing
 Calendar china = Calendar.getInstance( GMT8 );
 china.setTime( date );
 System.out.println( china.get( Calendar.DAY_OF_WEEK ) ); // 2
/* 
In addition to the notion
of a time zone, a Calendar has a Locale that governs conventions such as on which day
the week begins and ends. You can specify an alternate locale with the setLocale()
method. Most locale-specific details

Of course, you can format a date using the built in Java DateFormat class
*/

DateFormat simple = DateFormat.getInstance();
String now = simple.format( new Date() ); 
// etc...
DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT);
