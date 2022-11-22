package sectionNr5.Exercises;


public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        double area = width * height;
        double leftOvers = area - (areaPerBucket * extraBuckets);

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }

        if (extraBuckets > 0) {
            if (leftOvers % areaPerBucket != 0) {
                return (int) (leftOvers / areaPerBucket) + 1;
            } else {
                return (int) (leftOvers / areaPerBucket);
            }
        } else {
            if (leftOvers % areaPerBucket != 0) {
                return (int) (leftOvers / areaPerBucket) + 1;
            } else {
                return (int) (area / areaPerBucket);
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        double area = width * height;
        double calc = area / areaPerBucket;

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        if (area % areaPerBucket != 0) {
            return (int) (calc + 1);
        } else {
            return (int) (calc);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        if (area % areaPerBucket != 0) {
            return (int) (area / areaPerBucket) + 1;
        } else {
            return (int) (area / areaPerBucket);
        }
    }
}
