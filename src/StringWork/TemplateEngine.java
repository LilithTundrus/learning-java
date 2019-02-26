
/* 
The setup:

A common problem in Java
applications is working with bulky, multiline text. In general, you don’t want to store
the text of messages in your application code because it makes them difficult to edit or
internationalize. But when you move them to external files or resources, you need a way
for your application to plug in information at runtime. The best example of this is in
Java servlets; a generated HTML page is often 99% static text with only a few “variable”
pieces plugged in. Technologies such as JSP and XSL were developed to address this.
But these are big tools, and we have a simple problem. So let’s create a simple solution
—a template engine.


Our template engine reads text containing special template tags and substitutes values
that we provide. And because generating HTML or XML is one of the most important
applications of this, we’ll be friendly to those formats by making our tags conform to
the style of an XML comment. Specifically, our engine searches the text for tags that
look like this:
 <!--TEMPLATE:name This is the template for the user name -->

*/

import java.util.*;
import java.util.regex.*;

public class TemplateEngine {
    Properties values = new Properties();
    Pattern templateComment = Pattern.compile("(?si)<!--\\s*TEMPLATE:(\\w+).*?-->");

    public void set(String name, String value) {
        values.setProperty(name, value);
    }

    public String fillIn(String text) {
        Matcher matcher = templateComment.matcher(text);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            String name = matcher.group(1);
            String value = values.getProperty(name);
            matcher.appendReplacement(buffer, value);
        }
        matcher.appendTail(buffer);
        return buffer.toString();
    }
}


/* 
You’d use the Template class like this:
 String input = "<!-- TEMPLATE:name --> lives at "
 +"<!-- TEMPLATE:address -->";
 Template template = new Template();
 template.set("name", "Bob");
 template.set("address", "1234 Main St.");
 String output = template.fillIn( input );
In this code, input is a string containing tags for name and address. The set() method
provides the values for those tags.

*/