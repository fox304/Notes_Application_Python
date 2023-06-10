import errors
def print_one_note(notebook):
    
    num = input("введите номер записи: ")
    num = errors.err(notebook,num)              # проверка на наличие ключа
    print("||||||||||||||")
    print_one(notebook,num)
    print("||||||||||||||")
        
def print_one(notebook,i):                      # печать одной заметки
    print(f"Запись номер {i}: ")
    print(f"Дата, время: {notebook[i][0]}")
    print(f"Заголовок: {notebook[i][1]}")
    print(f"Запись: {notebook[i][2]}")
    print("******")

