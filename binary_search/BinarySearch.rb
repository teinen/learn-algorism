require 'time'

class BinarySearch
  input_arr = [11, 13, 17, 19, 23, 29, 31]
  target_num = 29

  head = 0
  tail = input_arr.size - 1

  start_time = Time.now

  while head <= tail do
    center = (head + tail) / 2

    if input_arr[center] == target_num
      puts "The target number(#{target_num}) was found."
      break

    elsif input_arr[center] < target_num
      head = center + 1

    else
      tail = center - 1
    end
  end

  if head > tail
    puts "The target number(#{target_num}) was not found..."
  end

  end_time = Time.now

  puts "Exec time: #{(end_time - start_time) * 100000} ms"
end