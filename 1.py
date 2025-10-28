# Домашнее задание

# Задача 1

# num = int(input("Введите число: "))
# for i in range(1, num + 1):
#     print(i, end=" ")

# # Задача 2
# num1 = int(input("Введите первое число: "))
# num2 = int(input("Введите второе число: "))
# if num1 > num2:
#     print(f"Большее число: {num1}")
# else:
#     print(f"Большее число: {num2}")

# Функции в Python

# # Задание 1
# n = input("Как вас зовут? ")
# def greet(name):
#    print(f"Здравствуйте, {name}!")
# greet(n)

# num = int(input("Введите число: "))
# def square(number):
#    return number ** 2
# print(f"Квадрат {num} равен {square(num)}")

# num1 = int(input("Введите первое число: "))
# num2 = int(input("Введите второе число: "))
# def max_of_two(x, y):
#    return x if x > y else y
# print(f"Большее число: {max_of_two(num1, num2)}")

# # Задание 2
# n = input("Как вас зовут? ")
# def describe_person(name, age=30):
#     print(f"Имя: {name}, Возраст: {age}")
# describe_person(n)
# describe_person(n, 21)

# # Задание 3
# num = int(input("Введите число: "))
# def is_prime(number):
#     if number < 2:
#         return False
#     for i in range(2, int(number ** 0.5) + 1):
#         if number % i == 0:
#             return False
#     return True
# print(is_prime(num))

# Работа с файлами

# # Задание 1 + 3
# def read_file(filename, mode='all'):
#     try:
#         with open(filename, 'r', encoding='utf-8') as file:
#             if mode == 'all':
#                 return file.read()
#             elif mode == 'line':
#                 return file.readlines()
#             else:
#                 content = ''
#                 for line in file:
#                     content += line
#                 return content
#     except FileNotFoundError:
#         print("Файл не найден")
#
# # print(read_file('exaple.txt','all'))
# # print(read_file('exaple.txt','line'))
# # print(read_file('exaple.txt','other'))
# # print(read_file('exaple.txt'))
# read_file('example.txt')

# # Задание 2
# text = input("Введите текст: ")
# with open('user_input.txt', 'w', encoding='utf-8') as file:
#     file.write(text)
#
# # Добавление текста в файл
# text = input("Введите текст: ")
# with open('user_input.txt', 'a', encoding='utf-8') as file:
#     file.write("\n" + text)
#
#
# Модули и пакеты

# # Задание 1
# import math
# import datetime
#
# sqrt_result = math.sqrt(25)
# current_time = datetime.datetime.now()
#
# print(sqrt_result)
# print(current_time)


# # Задание 2
# import my_module
# result = my_module.add(5, 3)
# print(result)

# Задание 3
# Создайте структуру пакета:
# my_package/
#     init.py
#     numbers.py
#     strings.py


from my_package import numbers, strings
result1 = numbers.multiply(4, 5)
result2 = strings.reverse_string("hello")

print(result1)
print(result2)