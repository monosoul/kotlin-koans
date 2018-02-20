package iii_conventions

import iii_conventions.TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int = when {
        year != other.year -> year.compareTo(other.year)
        month != other.month -> month.compareTo(other.month)
        else -> dayOfMonth.compareTo(other.dayOfMonth)
    }

    operator fun plus(interval: TimeInterval): MyDate {
        return addTimeIntervals(interval, 1)
    }

    operator fun plus(interval: MultipliedTimeInterval): MyDate {
        return addTimeIntervals(interval.interval, interval.times)
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = DateRange(this, other)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR;

    operator fun times(i: Int): MultipliedTimeInterval = MultipliedTimeInterval(this, i)

}

class MultipliedTimeInterval(val interval: TimeInterval, val times: Int)

class DateRange(override val start: MyDate, override val endInclusive: MyDate) : ClosedRange<MyDate>, Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object: Iterator<MyDate> {
            var curDate = start

            override fun hasNext(): Boolean {
                return curDate <= endInclusive
            }

            override fun next(): MyDate {
                try{
                    return curDate
                }
                finally {
                    curDate = curDate.nextDay()
                }
            }
        }
    }
}
