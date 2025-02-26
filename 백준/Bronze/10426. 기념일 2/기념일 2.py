from datetime import datetime, timedelta

inputDate, N = input().split();
dateFormat = "%Y-%m-%d"
formatInputDate =  datetime.strptime(inputDate, dateFormat)
pointDay = formatInputDate + timedelta(days=int(N)-1)
print(pointDay.strftime(dateFormat))
