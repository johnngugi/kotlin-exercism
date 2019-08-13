import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(timeParam: LocalDateTime) {

    var date: LocalDateTime = timeParam.plusSeconds(1_000_000_000)

    constructor(dateParam: LocalDate) : this(dateParam.atStartOfDay())
}