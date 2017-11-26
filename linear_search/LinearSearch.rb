require 'time'

class LinearSearch
  input_arr = [13, 5, 17, 2, 11, 35]
  target_num = 11
  target_find_flg = false

  start_time = Time.now

  input_arr.each do |input_num|
    if target_num == input_num
      target_find_flg = true
      puts "The target number(#{target_num}) was found."
      break;
    end
  end

  if target_find_flg == false
    puts "The target number(#{target_num}) was not found..."
  end

  end_time = Time.now

  puts "Exec time: #{(end_time - start_time) * 100000} ms"
end