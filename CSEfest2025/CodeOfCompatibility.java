package CSEfest2025;

import java.util.Scanner;

public class CodeOfCompatibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for person 1
        int bd1 = sc.nextInt();
        int bm1 = sc.nextInt();
        int by1 = sc.nextInt();

        // for person 2
        int bd2 = sc.nextInt();
        int bm2 = sc.nextInt();
        int by2 = sc.nextInt();

        // Root Numbers
        int DD1 = (bd1 / 10) + (bd1 % 10);
        int DD2 = 0;
        while (bd2 > 0) {
            DD2 += bd2 % 10;
            bd2 = bd2 / 10;
        }
        
        // Destiny Numbers
        // for person 1
        int sumOfmonth1 = 0;
        while (bm1 > 0) {
            sumOfmonth1 += bm1 % 10;
            bm1 = bm1 / 10;
        }
        int sumOfYear1 = 0;
        while (by1 > 0) {
            sumOfYear1 += by1 % 10;
            by1 = by1 / 10;
        }
        int DN1 = DD1 + sumOfmonth1 + sumOfYear1;

        // for person 2
        int sumOfmonth2 = 0;
        while (bm2 > 0) {
            sumOfmonth2 += bm2 % 10;
            bm2 = bm2 / 10;
        }
        int sumOfYear2 = 0;
        while (by2 > 0) {
            sumOfYear2 += by2 % 10;
            by2 = by2 / 10;
        }
        int DN2 = DD2 + sumOfmonth2 + sumOfYear2;
        
        // sum of the digits of destiny number
        int sumOfDN1 = 0;
        while (DN1 > 0) {
            sumOfDN1 += DN1 % 10;
            DN1 = DN1 / 10;
        }

        int sumOfDN2 = 0;
        while (DN2 > 0) {
            sumOfDN2 += DN2 % 10;
            DN2 = DN2 / 10;
        }

        // number lists (same as original code)
        int friendlyNum1[] = {1, 2, 3, 5, 6 , 9};
        int enemyNum1[] = {8};
        int nutralNum1[] = {4,7};

        int friendlyNum2[] = {1, 2, 3, 5};
        int enemyNum2[] = {8, 4, 9};
        int nutralNum2[] = {7, 6};

        int friendlyNum3[] = {1, 2, 3, 5};
        int enemyNum3[] = {6};
        int nutralNum3[] = {4, 8, 7, 9};

        int friendlyNum4[] = {1, 5, 7, 6};
        int enemyNum4[] = {2, 9, 4, 8};
        int nutralNum4[] = {3};

        int friendlyNum5[] = {1, 2, 3, 5, 6};
        int enemyNum5[] = { };
        int nutralNum5[] = {4, 7, 8, 9};

        int friendlyNum6[] = {1, 4, 5, 6, 7};
        int enemyNum6[] = {3};
        int nutralNum6[] = {2, 8, 9};

        int friendlyNum7[] = {1, 3, 4, 5, 6};
        int enemyNum7[] = {2};
        int nutralNum7[] = {8, 7, 9};

        int friendlyNum8[] = {5, 3, 6, 7};
        int enemyNum8[] = {1, 2, 4, 8};
        int nutralNum8[] = {9};

        int friendlyNum9[] = {1, 5, 3};
        int enemyNum9[] = {4, 2};
        int nutralNum9[] = {9, 7, 6, 8};

        // traverse and check
        // for Root comparison: DD1 vs DD2
        int point1 = 0;
        
        if (DD1 == 1) {
            for (int i = 0; i < friendlyNum1.length; i++) {
                if (friendlyNum1[i] == DD2) {
                    point1 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum1.length; i++) {
                if (nutralNum1[i] == DD2) {
                    point1 += 2;
                    break;
                }
            }
        } else if (DD1 == 2) {
            for (int i = 0; i < friendlyNum2.length; i++) {
                if (friendlyNum2[i] == DD2) {
                    point1 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum2.length; i++) {
                if (nutralNum2[i] == DD2) {
                    point1 += 2;
                    break;
                }
            }
        } else if (DD1 == 3) {
            for (int i = 0; i < friendlyNum3.length; i++) {
                if (friendlyNum3[i] == DD2) {
                    point1 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum3.length; i++) {
                if (nutralNum3[i] == DD2) {
                    point1 += 2;
                    break;
                }
            }
        } else if (DD1 == 4) {
            for (int i = 0; i < friendlyNum4.length; i++) {
                if (friendlyNum4[i] == DD2) {
                    point1 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum4.length; i++) {
                if (nutralNum4[i] == DD2) {
                    point1 += 2;
                    break;
                }
            }
        } else if (DD1 == 5) {
            for (int i = 0; i < friendlyNum5.length; i++) {
                if (friendlyNum5[i] == DD2) {
                    point1 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum5.length; i++) {
                if (nutralNum5[i] == DD2) {
                    point1 += 2;
                    break;
                }
            }
        } else if (DD1 == 6) {
            for (int i = 0; i < friendlyNum6.length; i++) {
                if (friendlyNum6[i] == DD2) {
                    point1 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum6.length; i++) {
                if (nutralNum6[i] == DD2) {
                    point1 += 2;
                    break;
                }
            }
        } else if (DD1 == 7) {
            for (int i = 0; i < friendlyNum7.length; i++) {
                if (friendlyNum7[i] == DD2) {
                    point1 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum7.length; i++) {
                if (nutralNum7[i] == DD2) {
                    point1 += 2;
                    break;
                }
            }
        } else if (DD1 == 8) {
            for (int i = 0; i < friendlyNum8.length; i++) {
                if (friendlyNum8[i] == DD2) {
                    point1 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum8.length; i++) {
                if (nutralNum8[i] == DD2) {
                    point1 += 2;
                    break;
                }
            }
        } else {
            for (int i = 0; i < friendlyNum9.length; i++) {
                if (friendlyNum9[i] == DD2) {
                    point1 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum9.length; i++) {
                if (nutralNum9[i] == DD2) {
                    point1 += 2;
                    break;
                }
            }
        }

        // for Destiny comparison: sumOfDN1 vs sumOfDN2
        int point2 = 0;

        if (sumOfDN1 == 1) {
            for (int i = 0; i < friendlyNum1.length; i++) {
                if (friendlyNum1[i] == sumOfDN2) {
                    point2 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum1.length; i++) {
                if (nutralNum1[i] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        } else if (sumOfDN1 == 2) {
            for (int i = 0; i < friendlyNum2.length; i++) {
                if (friendlyNum2[i] == sumOfDN2) {
                    point2 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum2.length; i++) {
                if (nutralNum2[i] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        } else if (sumOfDN1 == 3) {
            for (int i = 0; i < friendlyNum3.length; i++) {
                if (friendlyNum3[i] == sumOfDN2) {
                    point2 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum3.length; i++) {
                if (nutralNum3[i] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        } else if (sumOfDN1 == 4) {
            for (int i = 0; i < friendlyNum4.length; i++) {
                if (friendlyNum4[i] == sumOfDN2) {
                    point2 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum4.length; i++) {
                if (nutralNum4[i] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        } else if (sumOfDN1 == 5) {
            for (int i = 0; i < friendlyNum5.length; i++) {
                if (friendlyNum5[i] == sumOfDN2) {
                    point2 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum5.length; i++) {
                if (nutralNum5[i] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        } else if (sumOfDN1 == 6) {
            for (int i = 0; i < friendlyNum6.length; i++) {
                if (friendlyNum6[i] == sumOfDN2) {
                    point2 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum6.length; i++) {
                if (nutralNum6[i] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        } else if (sumOfDN1 == 7) {
            for (int i = 0; i < friendlyNum7.length; i++) {
                if (friendlyNum7[i] == sumOfDN2) {
                    point2 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum7.length; i++) {
                if (nutralNum7[i] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        } else if (sumOfDN1 == 8) {
            for (int i = 0; i < friendlyNum8.length; i++) {
                if (friendlyNum8[i] == sumOfDN2) {
                    point2 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum8.length; i++) {
                if (nutralNum8[i] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        } else {
            for (int i = 0; i < friendlyNum9.length; i++) {
                if (friendlyNum9[i] == sumOfDN2) {
                    point2 += 5;
                    break;
                }
            }
            for (int i = 0; i < nutralNum9.length; i++) {
                if (nutralNum9[i] == sumOfDN2) {
                    point2 += 2;
                    break;
                }
            }
        }

        int totalPoint = point1 + point2;
        System.out.println(totalPoint + " Highly Compatible");
    }
}

