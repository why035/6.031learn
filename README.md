# 6.031learn
// Java
int n = 3;
while (n != 1) {
    System.out.println(n);
    if (n % 2 == 0) {
        n = n / 2;
    } else {
        n = 3 * n + 1;
    }
}
System.out.println(n);


# Python
n = 3
while n != 1:
    print n
    if n % 2 == 0:
        n = n / 2
    else:
        n = 3 * n + 1


print n
