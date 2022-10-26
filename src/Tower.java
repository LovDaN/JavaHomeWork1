public class Tower {
    public static void main(String[] args) {

            int disks = 3;
            towers(disks, 'A', 'B', 'C');
        }
        public static void towers( int topN, char from, char inter, char to){
            if (topN == 1) {
                System.out.println("Disk 1 from "
                        + from + " to " + to);
            } else {
                towers(topN - 1, from, to, inter);
                System.out.println("Disk "
                        + topN + " from " + from + " to " + to);
                towers(topN - 1, inter, from, to);
            }
        }
    }
