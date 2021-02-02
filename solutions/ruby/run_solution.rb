require 'colorize'
require './day_of_the_programmer'

#input parsing and reading
input00 = File.open("../../test-cases/input/input00.txt")
input01 = File.open("../../test-cases/input/input01.txt")
input60 = File.open("../../test-cases/input/input60.txt")

data = input00.map(&:chomp)
year00 = data[0].to_i

data = input01.map(&:chomp)
year01 = data[0].to_i

data = input60.map(&:chomp)
year60 = data[0].to_i


# problem application
start = Time.now
response00 = DayOfTheProgrammer.run year00
response01 = DayOfTheProgrammer.run year01
response60 = DayOfTheProgrammer.run year60
finish = Time.now

puts("solved all the test cases in " + (1000 * (finish - start)).round(2).to_s + "ms")

#expected outputs

output00File = File.open("../../test-cases/output/output00.txt")
output01File = File.open("../../test-cases/output/output01.txt")
output60File = File.open("../../test-cases/output/output60.txt")


data = output00File.map(&:chomp)
output00 = data[0]

data = output01File.map(&:chomp)
output01 = data[0]

data = output60File.map(&:chomp)
output60 = data[0]

if response00 === output00
	puts "INPUT 00".green
else
	puts "INPUT 00".red
end

if response01 === output01
	puts "INPUT 01".green
else
	puts "INPUT 01".red
end

if response60 === output60
	puts "INPUT 60".green
else
	puts "INPUT 60".red
end