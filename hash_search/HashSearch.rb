require 'time'

class HashSearch
  arr_d = [12, 25, 36, 20, 30, 8, 42]
  len = arr_d.size

  arr_h= Array.new(len * 2, 0)

  i = 0
  k = 0

  start_time = Time.now

  puts "=== Exec Hash Searchin Ruby ==="

  # Store data using hash
  while i < len
    k = arr_d[i] % 11

    k = (k + 1) % 11 while arr_h[k] != 0

    arr_h[k] = arr_d[i]
    i += 1
  end

  # Input search target
  target = 25
  k = target % 11

  puts arr_h.to_s

  # Search target number
  while arr_h[k] != 0
    if arr_h[k] == target
      puts "Target number(#{target}) is stored at index of #{k}"
      break

    else
      k = (k + 1) % 11
    end
  end

  puts "Target number(#{target}) is not stored in array." \
    if arr_h[k] == 0

  end_time = Time.now

  puts "Exec time: #{(end_time - start_time) * 100000} ms"
end