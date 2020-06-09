bgr = []
drk = []
bgr.append(int(input()))
bgr.append(int(input()))
bgr.append(int(input()))
drk.append(int(input()))
drk.append(int(input()))
bgr.sort()
drk.sort()
print(bgr[0] + drk[0] - 50)