/* 
Java is used all over the world, meaning sometimes the users of your application
or code won't be speaking english.

Java widely supports the localizing of the text within your application
*/

/* Internationalization programming revolves around the Locale class. The class itself is
very simple; it encapsulates a country code, a language code, and a rarely used variant
code. Commonly used languages and countries are defined as constants in the Locale
class. (Maybe it’s ironic that these names are all in English.) You can retrieve the codes
or readable names, as follows: */
Locale l=Locale.ITALIAN;System.out.println(l.getCountry()); // IT
System.out.println(l.getDisplayCountry()); // Italy
System.out.println(l.getLanguage()); // it
System.out.println(l.getDisplayLanguage()); // Italian

System.out.printf(Locale.ITALIAN,"%f\n",3.14); // "3,14"
/*  The preceding statement uses the Italian Locale to indicate that the decimal number
 3.14 should be formatted as it would in Italian, using a comma instead of a decimal
 point */

/* 
Resource bundles in Java help with making an application truly localized. The ResourceBundle class offers a clean,
flexible solution for factoring out the text and resources of your application into
language-specific classes or text file


A ResourceBundle is a collection of objects that your application can access by name.
It acts much like the Hashtable or Map collections

 A ResourceBundle of a given name may
be defined for many different Locales. To get a particular ResourceBundle, call the
factory method ResourceBundle.getBundle(), which accepts the name of the ResourceBundle and a Locale. 

Basic example:
*/

import java.util.*;

public class InternationalizationNotes {
    public static void main(String[] args) {
        ResourceBundle bun;
        bun = ResourceBundle.getBundle("Message", Locale.ITALY);
        System.out.println(bun.getString("HelloMessage"));
        bun = ResourceBundle.getBundle("Message", Locale.US);
        System.out.println(bun.getString("HelloMessage"));
    }
}

/*
 * The getBundle() method throws the runtime exception MissingResourceException
 * if an appropriate ResourceBundle cannot be located. You can provide
 * ResourceBundles in two ways: either as compiled Java classes (hardcoded Java)
 * or as simple property files. Resource bundles implemented as classes are
 * either subclasses of ListResourceBundle or direct implementations of
 * ResourceBun dle. Resource bundles backed by a property file are represented
 * at runtime by a Prop ertyResourceBundle object. ResourceBundle.getBundle()
 * returns either a matching class or an instance of PropertyResourceBundle
 * corresponding to a matching property file. The algorithm used by getBundle()
 * is based on appending the country and lan‐ guage codes of the requested
 * Locale to the name of the resource. Specifically, it searches for resources
 * in this order:
 * 
 * name_language_country_variant name_language_country name_language name
 * name_default-language_default-country_default-variant
 * name_default-language_default-country name_default-language
 */

// Example resource bundle (typically this is put in another file)
public class Message_it_IT extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
    {"HelloMessage", "Buon giorno, world!"},
    {"OtherMessage", "Ciao."},
    };
}
