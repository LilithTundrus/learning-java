/* 
A regular expression describes a pattern in text. By pattern, we mean just about any
feature you can imagine identifying in text from the literal characters alone, without
actually understanding their meaning. This includes features, such as words, word
groupings, lines and paragraphs, punctuation, case, and more generally, strings and
numbers with a specific structure to them, such as phone numbers, email addresses,
and quoted phrases.

Not only can the regex notation get a little hairy, but it is also some‐
what ambiguous with ordinary Java strings. An important part of the notation is the
escaped character, a character with a backslash in front of it. For example, the escaped
d character, \d, (backslash ‘d’) is shorthand that matches any single digit character (0-9).
However, you cannot simply write \d as part of a Java string, because Java uses the
backslash for its own special characters and to specify Unicode character sequences
(\uxxxx). Fortunately, Java gives us a replacement: an escaped backslash, which is two
backslashes (\\), means a literal backslash. The rule is, when you want a backslash to
appear in your regex, you must escape it with an extra one:
 "\\d" // Java string that yields backslash "d"

If you need to create part of an expression that has lots of literal characters in it, you
can use the special delimiters \Q and \E to help you. Any text appearing between \Q and
\E is automatically escaped. (You still need the Java String escapes—double backslashes
for backslash, but not quadruple.) There is also a static method Pattern.quote(), which
does the same thing, returning a properly escaped version of whatever string you
give it.

The final main thing is that working with regex in any language, always comment a line above the regex
of what it's meant to be mathing

The . Regex character

The special character dot (.) matches any single character. The pattern “.ose”
matches rose, nose, _ose (space followed by ose) or any other character followed
by the sequence ose. Two dots match any two characters, and so on. The dot operator
is not discriminating; it normally stops only for an end-of-line character


Whitespace or nonwhitespace character \s or \S

The special character \s matches a literal-space character or one of the following
characters: \t (tab), \r (carriage return), \n (newline), \f (formfeed), and back‐
space. The corresponding special character \S does the inverse, matching any char‐
acter except whitespace.


Digit or nondigit character \d or \D
\d matches any of the digits 0-9. \D does the inverse, matching all characters except
digits.


Word or nonword character \w or \W
\w matches a “word” character, including upper- and lowercase letters A-Z, a-z, the
digits 0-9, and the underscore character (_). \W matches everything except those
characters.


You can define your own character classes using the notation [...]. For example, the
following class matches any of the characters a, b, c, x, y, or z:
 [abcxyz]

The special x-y range notation can be used as shorthand for the alphabetic characters.
The following example defines a character class containing all upper- and lowercase
letters:
 [A-Za-z]

Placing a caret (^) as the first character inside the brackets inverts the character class.
This example matches any character except uppercase A-F:
 [^A-F] // G, H, I, ..., a, b, c, ... etc.
Nesting character classes simply adds them:
 [A-F[G-Z]] // A-Z
The && logical AND notation can be used to take the intersection (characters
in common):
 [a-p&&[l-z]] // l, m, n, o, p
 [A-Z&&[^P]] // A through Z except P
*/

/* 
Iteration (multiplicity)
Simply matching fixed character patterns would not get us very far. Next, we look at
operators that count the number of occurrences of a character

Any (zero or more iterations): asterisk (*)
Placing an asterisk (*) after a character or character class means “allow any number
of that type of character”—in other words, zero or more. For example, the following
pattern matches a digit with any number of leading zeros (possibly none):
 0*\d // match a digit with any number of leading zeros

Some (one or more iterations): plus sign (+)
The plus sign (+) means “one or more” iterations and is equivalent to XX* (pattern
followed by pattern asterisk). For example, the following pattern matches a number
with one or more digits, plus optional leading zeros:
 0*\d+ // match a number (one or more digits) with optional leading zeros

It may seem redundant to match the zeros at the beginning of an expression because
zero is a digit and is thus matched by the \d+ portion of the expression anyway.
However, we’ll show later how you can pick apart the string using a regex and get
at just the pieces you want. In this case, you might want to strip off the leading zeros
and keep only the digits.


Optional (zero or one iteration): question mark (?)
The question mark operator (?) allows exactly zero or one iteration. For example,
the following pattern matches a credit-card expiration date, which may or may not
have a slash in the middle:
 \d\d/?\d\d // match four digits with an optional slash in the middle


Range (between x and y iterations, inclusive): {x,y}
The {x,y} curly-brace range operator is the most general iteration operator. It
specifies a precise range to match. A range takes two arguments: a lower bound and
an upper bound, separated by a comma. This regex matches any word with five to
seven characters, inclusive:
 \b\w{5,7}\b // match words with at least 5 and at most 7 characters
At least x or more iterations (y is infinite): {x,}
If you omit the upper bound, simply leaving a dangling comma in the range, the
upper bound becomes infinite. This is a way to specify a minimum of occurrences
with no maximum.

Note that this is not ALL regex has to offer but covers a bit of the basics
*/



