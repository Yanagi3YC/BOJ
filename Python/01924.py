x, y = map(int, input().split())
day = 0

if x == 1: day = y
elif x == 2: day = y + 31
elif x == 3: day = y + 59
elif x == 4: day = y + 90
elif x == 5: day = y + 120
elif x == 6: day = y + 151
elif x == 7: day = y + 181
elif x == 8: day = y + 212
elif x == 9: day = y + 243
elif x == 10: day = y + 273
elif x == 11: day = y + 304
elif x == 12: day = y + 334

if day % 7 == 1: print('MON')
elif day % 7 == 2: print('TUE')
elif day % 7 == 3: print('WED')
elif day % 7 == 4: print('THU')
elif day % 7 == 5: print('FRI')
elif day % 7 == 6: print('SAT')
elif day % 7 == 0: print('SUN')