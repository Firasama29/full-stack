package com.practive.conversions;

public class Convert {

    public static void main(String[] args) {
        float floatValue = 5.98f;
        double doubleValue = 6.456;


        //Casting
        //it is only possible to type-case higher values into low ones. float and double have higher ranges than long and int
        //Type casting here doesn't do anything special. It only discards any numbers after the decimal point
        long floatToLongByCasting = (long) floatValue;
        long doubleToLongByCasting = (long) doubleValue;
        System.out.println("long type casting:");
        System.out.printf("float: %f -> long: %d %n", floatValue, floatToLongByCasting);
        System.out.printf("double: %f -> long: %d %n", doubleValue, doubleToLongByCasting);

        int floatToIntByCasting = (int) floatValue;
        int doubleToIntByCasting = (int) doubleValue;
        System.out.println("\nint type casting:");
        System.out.printf("float: %f -> int: %d %n", floatValue, floatToIntByCasting);
        System.out.printf("double: %f -> int: %d %n", doubleValue, doubleToIntByCasting);


        /*
            .longValue(), .intValue(), .floatValue(), .doubleValue()
            This method is more suitable when you have wrapper objects
            This approach is done by first autoboxing the primitive data type into a wrapper object
            then calling .longValue() or .intValue() or .floatValue() or .DoubleValue() method which internally casts one data type into another

            public long longValue() {
                return (long)value
            }
        */
        Float floatWrapperObject = 40.6493f;
        Double doubleWrapperObject = 74.9375;
        Integer intWrapperObject = 78;
        Long longWrapperObject = 3564L;

        long floatToLong = floatWrapperObject.longValue();
        int doubleToInt = doubleWrapperObject.intValue();
        float intToFloat = intWrapperObject.floatValue();
        double longToDouble = longWrapperObject.doubleValue();
        int longToInt = longWrapperObject.intValue();
        long intToLong = intWrapperObject.longValue();

        System.out.println("second approach:");
        System.out.printf("float: %f, long: %d %n", floatWrapperObject, floatToLong);
        System.out.printf("double: %f, integer: %d %n", doubleWrapperObject, doubleToInt);

    /*
        Math.round and type-casting
        This method is useful when we want to round the float or double
     */
        float floatPoints = 87.25f;
        double doublePoints = 87.64;

        long rounded = Math.round(floatPoints);
        long rounded2 = Math.round(doublePoints);
        System.out.println("\nusing Math.round:");
        System.out.printf("float: %f, long: %d %n rounded down", floatPoints, rounded);
        System.out.printf("double: %f, long: %d rounded up", doublePoints, rounded2);

    }
}
