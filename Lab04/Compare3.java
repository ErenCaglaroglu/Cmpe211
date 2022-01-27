

import java.util.*;
public class Compare3 implements  Comparable<Compare3> {

        public int compareTo (Compare3 o){
            return 0;
        }

        public static Comparable largest (Comparable val1, Comparable val2, Comparable val3){

            if (val1.compareTo(val2) < 0 && val1.compareTo(val3) > 0) {
                return val1;
            } else if (val2.compareTo(val3) > 0 && val2.compareTo(val1) > 0) {
                return val2;
            } else if (val3.compareTo(val1) > 0 && val3.compareTo(val2) > 0) {
                return val3;
            }

            return 0;


        }


    }
