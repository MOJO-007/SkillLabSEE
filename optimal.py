import heapq

arr = [12, 3, 5, 7, 19]
k = 2

# Kth smallest using min heap
min_heap = arr[:]
heapq.heapify(min_heap)
for _ in range(k - 1):
    heapq.heappop(min_heap)
kth_smallest = min_heap[0]

# Kth largest using max heap (by negating values)
max_heap = [-num for num in arr]
heapq.heapify(max_heap)
for _ in range(k - 1):
    heapq.heappop(max_heap)
kth_largest = -max_heap[0]

print("Kth Smallest Element:", kth_smallest)
print("Kth Largest Element:", kth_largest)
