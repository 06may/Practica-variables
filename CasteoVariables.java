public class CasteoVariables {
    public static void main(String[] args) {
        // 1. Conversión de String a int
        String strToInt = "123";
        int intValue = Integer.parseInt(strToInt);
        System.out.println("String a int: " + intValue);

        // 2. Conversión de String a double
        String strToDouble = "123.45";
        double doubleValue = Double.parseDouble(strToDouble);
        System.out.println("String a double: " + doubleValue);

        // 3. Conversión de int a String
        int intToStr = 456;
        String strFromInt = Integer.toString(intToStr);
        System.out.println("int a String: " + strFromInt);

        // 4. Conversión de double a String
        double doubleToStr = 789.01;
        String strFromDouble = Double.toString(doubleToStr);
        System.out.println("double a String: " + strFromDouble);

        // 5. Casting de double a int y de int a double
        double doubleToInt = 123.99;
        int castedInt = (int) doubleToInt;
        int intToDouble = 789;
        double castedDouble = (double) intToDouble;
        System.out.println("double a int: " + castedInt);
        System.out.println("int a double: " + castedDouble);

        // 6. Conversión de String a boolean y viceversa
        String strToBool = "true";
        boolean booleanValue = Boolean.parseBoolean(strToBool);
        String strFromBool = Boolean.toString(booleanValue);
        System.out.println("String a boolean: " + booleanValue);
        System.out.println("boolean a String: " + strFromBool);

        // 7. Casting entre float, long y byte
        float floatValue = 123.45f;
        long longValue = (long) floatValue;
        byte byteValue = (byte) longValue;
        System.out.println("float a long: " + longValue);
        System.out.println("long a byte: " + byteValue);

        // 8. Boxing y unboxing implícito entre int y Integer
        int primitiveInt = 10; // Paso 1
        Integer boxedInteger = primitiveInt; // Auto-boxing (Paso 2)
        int unboxedInt = boxedInteger; // Unboxing (Paso 3)
        System.out.println("int: " + primitiveInt);
        System.out.println("Integer (auto-boxed): " + boxedInteger);
        System.out.println("int (unboxed): " + unboxedInt);

        // 9. Boxing y unboxing con otros tipos primitivos
        float primitiveFloat = 12.34f;
        double primitiveDouble = 56.78;
        boolean primitiveBoolean = true;

        Float boxedFloat = primitiveFloat; // Boxing
        Double boxedDouble = primitiveDouble; // Boxing
        Boolean boxedBoolean = primitiveBoolean; // Boxing

        float unboxedFloat = boxedFloat; // Unboxing
        double unboxedDouble = boxedDouble; // Unboxing
        boolean unboxedBoolean = boxedBoolean; // Unboxing

        System.out.println("float: " + primitiveFloat + " -> Float: " + boxedFloat + " -> float: " + unboxedFloat);
        System.out.println("double: " + primitiveDouble + " -> Double: " + boxedDouble + " -> double: " + unboxedDouble);
        System.out.println("boolean: " + primitiveBoolean + " -> Boolean: " + boxedBoolean + " -> boolean: " + unboxedBoolean);
    }
}
