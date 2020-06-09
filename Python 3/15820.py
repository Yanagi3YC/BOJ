sample, system = map(int, input().split())
sample_lst = []
system_lst = []

for i in range(sample):
    sample_lst.append([])
for i in range(system):
    system_lst.append([])
for i in range(sample):
    sample_lst[i] = list(map(int, input().split()))
for i in range(system):
    system_lst[i] = list(map(int, input().split()))

sample_count = 0
system_count = 0
for i in range(sample):
    if sample_lst[i][0] == sample_lst[i][1]: sample_count += 1
for i in range(system):
    if system_lst[i][0] == system_lst[i][1]: system_count += 1

if sample_count == sample and system_count == system: print("Accepted")
elif sample_count == sample and system_count != system: print("Why Wrong!!!")
elif sample_count != sample: print("Wrong Answer")