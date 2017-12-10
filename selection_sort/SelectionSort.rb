require 'time'

class SelectionSort
  input_arr = [20, 13, 17, 15, 18, 16, 14, 19]

  i = 0
  k = 0
  idxMin = 0
  w = 0

  len = input_arr.size

  start_time = Time.now

  while i < len - 1 do
    idxMin = i
    k = i + 1

    while k < len do
      if input_arr[k] < input_arr[idxMin]
        idxMin = k
      elsif
        k += 1
      end
    end

    w = input_arr[i]

    input_arr[i] = input_arr[idxMin]

    input_arr[idxMin] = w

    i += 1
  end

  puts input_arr.to_s

  end_time = Time.now

  puts "Exec time: #{(end_time - start_time) * 100000} ms"
end