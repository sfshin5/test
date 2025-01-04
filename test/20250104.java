void bubbleSort(int[] arrary) {
    int n = arrary.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arrary[j] > arrary[j + 1]) {
                int temp = arrary[j];
                arrary[j] = arrary[j + 1];
                arrary[j + 1] = temp;
            }
        }
    }
}

// 次の閏年を取得する関数
int getNextLeapYear(int year) {
    if (year % 4 == 0) {
        if (year % 100 != 0 || year % 400 == 0) {
            return year + 4;
        }
    }
    return getNextLeapYear(year + 1);
}

