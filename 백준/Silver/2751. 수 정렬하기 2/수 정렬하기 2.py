import sys

n = int(sys.stdin.readline())
data = [int(sys.stdin.readline()) for _ in range(n)]
data.sort()
sys.stdout.write("\n".join(map(str, data)) + "\n")