[16,21,11,8,12,22] -> Merge Sort
Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

Başlangıç:[16,21,11,8,12,22]

1:[16,21,11] - [8,12,22]
2:[16,21] - [11] - [8,12,22]
3:[16] - [21] - [11]-[8,12,22]
4:[16,21] - [11] - [8,12,22]
5:[11,16,21] - [8,12,22]
6:[11,16,21] - [8,12] - [22]
7:[11,16,21] - [8] - [12] - [22]
8:[11,16,21] - [8,12] - [22]
9:[11,16,21] - [8,12,22]
10:[8,11,12,16,21,22]

Big-O:
O(nlogn)