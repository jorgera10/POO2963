def square_number(number):
    return number**2
def print_number_pairs():
    numbers = range(20)
    numbers = range (20)
    even = [square_number(number) for number in numbers if number % 2 == 0]
    odd = [square_number(number) for number in numbers if number % 2 != 0]
    for even,odd in zip(even,odd):
        print('{} -> {}'.format(even,odd))
print_number_pairs()
try:
    10/0
except Exception as e:
    print(e.args)