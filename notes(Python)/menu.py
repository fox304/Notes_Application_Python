import json
import print_menu
import print_notes
import output_specific_note
import create_note
import deleted_note
import edition_note


def start_notebook():
    notebook = read_from_file()
    return notebook
    

def my_menu(notebook):
    n = ' '
    while n != "":
        print_menu.print_m()
        k = input('введите номер из меню: ')
        if k == "":break                         # выход из программы
        if k not in "12345":                     # требование ввода пунктов меню
            print("Сделайте корректный ввод")
            continue
        n = int(k)
        commands(n,notebook)
        save_to_file(notebook) 


def commands(n,notebook):
    command = [print_notes.print_all,               # список команд
               output_specific_note.print_one_note,
               deleted_note.del_note,
               edition_note.edit_note,
               create_note.making_note]
    command[n-1](notebook)                          # вызов определенной команды
    

def save_to_file(notebook):                         # запись в файл
    with open("file_1.json",'w') as file1:
        json.dump(notebook,file1,indent = 3)

def read_from_file():                               # чтение из файла
    with open("file_1.json",'r') as file1:
        notebook = json.load(file1)
    return notebook