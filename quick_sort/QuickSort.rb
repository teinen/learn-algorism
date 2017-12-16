require 'time'

class QuickSort
  def quick_sort(arr, left, right)
    return if left >= right

    pivot = arr[(left + right) / 2]
    l = left
    r = right

    while l <= r
      l += 1 while arr[l] < pivot
      r -= 1 while arr[r] > pivot

      if l <= r
        arr[l], arr[r] = arr[r], arr[l]
        l += 1
        r -= 1
      end
    end

    quick_sort(arr, left, r)
    quick_sort(arr, l, right)

    return arr
  end

  arr = [17,72,27,77,43,100,6,9,92,37,1,50,36,67,45,98,33,54,19,91,99,65,3,69,12,79,18,42,90,16,84,51,70,29,61,2,14,76,39,95,81,97,82,96,63,58,53,89,11,5,20,47,23,88,44,62,83,7,34,74,10,57,64,22,32,48,4,46,80,13,71,38,25,93,15,21,73,30,66,26,56,55,8,24,52,94,49,40,87,60,31,75,41,59,28,78,35,86,68,85]

  left = 0
  right = arr.size - 1;

  start_time = Time.now

  puts "=== Exec Quick Sort in Ruby ==="

  result = QuickSort.new.quick_sort(arr, left, right)

  puts result.to_s

  end_time = Time.now

  puts "Exec time: #{(end_time - start_time) * 100000} ms"
end