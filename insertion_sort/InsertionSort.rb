require 'time'

class InsertionSort
  input_arr = [7, 3, 10, 2, 1, 6, 5, 9, 8, 4]

  i = 1
  k = 0
  tmp = 0

  len = input_arr.size

  start_time = Time.now

  puts "=== Exec Insertion Sort in Ruby ==="

  while i < len
    tmp = input_arr[i]
    k = i

    while (k > 0) && (input_arr[k - 1] > tmp)
      input_arr[k] = input_arr[k - 1]
      k -= 1
    end

    input_arr[k] = tmp
    i += 1
  end

  puts input_arr.to_s

  end_time = Time.now

  puts "Exec time: #{(end_time - start_time) * 100000} ms"
end