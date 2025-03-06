N, name = input().split()

smupc_name_list = list(dict.fromkeys(name)) # 중복 제거
count = len(name) - len(smupc_name_list) + 4

smupc_name_list.append(str(count))
smupc_name = str(int(N) + 1906) + ''.join(smupc_name_list)
smupc_name = "smupc_" + smupc_name[::-1]

print(smupc_name)