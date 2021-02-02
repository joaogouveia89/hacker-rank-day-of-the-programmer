class DayOfTheProgrammer
		#months constants
		JANUARY = 1
		FEBRUARY = 2
		MARCH = 3
		APRIL = 4
		MAY = 5
		JUNE = 6
		JULY = 7
		AUGUST = 8
		SEPTEMBER = 9
		OCTOBER = 10
		NOVEMBER = 11
		DECEMBER = 12

	def self.run year
		is_leap_year = (year < 1918) ? (year % 4 == 0) : ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		current_day_of_year = 1
		day = 1
		month = JANUARY
		while current_day_of_year != 256
			if day === 31 && month === JANUARY && year === 1918
				day = 14
				month = FEBRUARY
			elsif (
				(day === 31 && (month === JANUARY || month === MARCH || month === MAY || month === JULY || month === AUGUST || month === OCTOBER || month === DECEMBER)) ||
				(day === 30 && (month === APRIL || month === JUNE || month === SEPTEMBER || month === NOVEMBER)) ||
				(is_leap_year && day === 29 && month === FEBRUARY) ||
				(!is_leap_year && day === 28 && month === FEBRUARY)
				)
				day = 1
				month = month + 1
			else
				day = day + 1
			end
			current_day_of_year = current_day_of_year + 1
		end

		formatted_day = day / 10 > 0 ? day.to_s : "0" + day.to_s
		formatted_month = month / 10 > 0 ? month.to_s : "0" + month.to_s

		return formatted_day + "." + formatted_month + "." + year.to_s
	end
end