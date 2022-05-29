fun foo(name: String, number: Int, toUpperCase: Boolean): String? {
    return (if (toUpperCase) name.toUpperCase() else name) + number
}

fun foo(name: String, number: Int): String? {
    return foo(name, number, false)
}

fun foo(name: String, toUpperCase: Boolean): String? {
    return foo(name, 42, toUpperCase)
}

fun foo(name: String): String? {
    return foo(name, 42)
}
/*public String foo(String name, int number, boolean toUpperCase)
{
    return (toUpperCase ? name.toUpperCase() : name) + number;
}
public String foo(String name, int number) {
    return foo(name, number, false);
}
public String foo(String name, boolean toUpperCase)
{ return foo(name, 42, toUpperCase); }

public String foo(String name) { return foo(name, 42); }*/
