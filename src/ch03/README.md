### Greedy Method
* 그 순간에 가장 좋다고 생각되는 것을 선택하여 최종적인 해답 도달
* `최적화 문제`를 해결함
* 데이터 간의 관계 고려 X
* 한번 선택하면 이 값을 번복하지 않음

```text
solution = null
for i = 1 to n do
    x = SELECT(A)
    if FEASIBLE(solution, X)
        then solution = solution U { X }
    endif
endfor
return solution
```

#### Fractional Knapsack Problem
```text
Cu = w
for i = 1 to n
    if (W(i) > Cu)) then exit;
    X(i) = 1
    Cu = Cu - W(i)
if (i <= n) then X(i) = Cu / W(i)
```
```text
정렬이 안 되어 있는 경우 = O(nlogn)
정렬이 되어 있는 경우 = O(n)
```

#### 0-1 Knapsack Problem
* greedy 알고리즘으로 풀 수 없음 

#### Two-way optimal merge patterns
```text
각각 정렬된 n, m개의 데이터를 merge => O(n + m)
처음 내림차순으로 정렬 => O(nlogn)
제일 작은 두 값을 더한 후 재배치 => O(n)
O(nlogn) + O(n) * n = O(n^2)
```

#### huffman code
