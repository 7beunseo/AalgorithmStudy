#### 순차 검색
```text
O(n)
```
#### 이분 검색
```text
// 오름차순 정렬이 기본 조건

T(n) = T(n/2) + 1
T(n/2) = T(n/4) + 1
...
T(n) = T(n/2^k) + k

k = log n, T(1) = 1

… T(n) = 1 + log n
… O(n)
```

#### 피보나치 v재귀
```text
T(n) = T(n - 1) + T(n - 2) + 1
     > 2(T(n - 2)) // T(n - 1) > T(n - 2)이므로 
     > 4(T(n - 4))
     > 8(T(n - 6))
     ...
     > 2^k(T(n - 2k))
     
T(0) = 1, T(1) = 1 이므로 n = 2k라고 하면 k = n / 2
T(n) > 2^(n/2)(T(0)) = 2^(n/2)

// 수행 속도가 매우 느린 것을 확인할 수 있음 
```

#### 비보나치 v반복
```text
0부터 n까지 반복하여 T(n) = n + 1
… O(n)

// 재귀적인 방식보다 빠르다!
// 궁금 -> n번재 피보나치를 찾는 것이니까 T(n) = n 아닌가? 
```

#### 수행시간 비교
```text
log n < n < nlogn < n^2 < n^3 < 2^n < n!
```
#### 순차검색 최악, 평균, 최선
```text
* 최약 
W(n) = n // x가 배열의 마지막 아이템이거나 없는 경우

* 평균
** 데이터가 배열에 있는 경우
: k번재에 데이터가 있을 확률 = 1/n
T(n) = 1/n * Σ k
     = 1/n * n(n + 1)/2 
     = (n + 1)/2
     
** 데이터가 배열에 없는 경우
데이터가 배열에 있을 확률 = p
: k번재에 데이터가 있을 확룔 p/n

데이터가 배열에 없을 확률 = 1 - p
T(n) = p/n * Σ k + n(1 - p)
     = p/n * n(n + 1)/2 + n - np
     = pn/2 + p/2 + n - np
     = n(1 - p/2) + p/2
     
* 최적
B(n) = 1 
```

#### BIG-Oh
```text
|g(n)| <= c * |f(n)| (c>0, n >= n0, n0 >= 1)
```

```text
* g(n) = 2n^2 - 2n + 5
c = 2, n0 = 3
f(n) = 2n^2

… O(n^2)

O(n)이 가능한가?
-> 아무리 큰 c값이라도 만족하지 않는 n 값이 있다.
```

#### BIG-omega
```text
|g(n)| >= c|f(n)|
```

#### BIG-Theta
```text
c1|f(n)| <= |g(n)| <= c2|f(n)|
```

