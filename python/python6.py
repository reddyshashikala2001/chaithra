num = 17
is_prime = True
for i in range(2, num):
    if num % i == 0:
        is_prime = False
        break
print("Prime" if is_prime else "Not Prime")
