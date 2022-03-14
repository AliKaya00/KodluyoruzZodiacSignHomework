import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ZoiacSign {
    public static void main(String[] args) {
        String zodiac = null;
        int month, day;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Your Birth month: ");
        month = input.nextInt();

        System.out.println("Your birth day: ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiac = "Oğlak";
                } else {
                    zodiac = "Kova";
                }
            } else {
                isError = true;
            }

        }
        if (month == 2) {
            if (day >= 1 && day <= 29) {
                if (day <= 19) {
                    zodiac = "Kovca";
                } else {
                    zodiac = "Balık";
                }
            } else {
                isError = true;
            }
        }
        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    zodiac = "Balık";
                } else {
                    zodiac = "Koç";
                }
            } else {
                isError = true;
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    zodiac = "Koç";
                } else {
                    zodiac = "Boğa";
                }
            } else {
                isError = true;
            }
        }
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiac = "Boğa";
                } else {
                    zodiac = "İkizler";
                }
            } else {
                isError = true;
            }
        }
        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    zodiac = "İkizler";
                } else {
                    zodiac = "Yengeç";
                }
            } else {
                isError = true;
            }
        }
        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "Yengeç";
                } else {
                    zodiac = "Aslan";
                }
            } else {
                isError = true;
            }
        }
        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "Aslan";
                } else {
                    zodiac = "Başak";
                }
            } else {
                isError = true;
            }
        }
        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    zodiac = "Başak";
                } else {
                    zodiac = "Terazi";
                }
            } else {
                isError = true;
            }
        }
        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 23) {
                    zodiac = "Terazi";
                } else {
                    zodiac = "Akrep";
                }
            } else {
                isError = true;
            }
        }
        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    zodiac = "Akrep";
                } else {
                    zodiac = "Yay";
                }
            } else {
                isError = true;
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiac = "Yay";
                } else {
                    zodiac = "Oğlak";
                }
            } else {
                isError = true;
            }
        }
        if (isError ){
            System.out.println("Invalid value");

        }else{
            System.out.println("Your Zodiac Sign: " + zodiac);
        }
    }
}