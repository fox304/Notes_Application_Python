

import json
import print_menu
import print_notes
import output_specific_note
import create_note
import deleted_note
import edition_note
from datetime import datetime


time = datetime.today().strftime("%Y-%m-%d %H часов %M минут %S секунд")


def start_notebook():
    notebook = {1:[time,'"one"','первая запись'],2:[time,'"two"','вторая запись'],
                3:[time,'"three"','третья запись'],4:[time,'"foure"','444444444444'],
                5:[time,'"five"','55555555555'],6:[time,'"six"','666666666'],
                7:[time,'"seven"','7777777777777']
               }

    save_to_file(notebook)   
               

    
    
    return notebook

def my_menu(notebook):
    

    n = ' '
    while n != "":
        print_menu.print_m()
        k = input('введите номер из меню: ')

        if k == "":break                         # выход из программы
        if k not in "12345":
            print("Сделайте корректный ввод")
            continue

        n = int(k)
        commands(n,notebook)
        save_to_file(notebook) 

        
    
def commands(n,notebook):

    if n == 1:
        print_notes.print_all(notebook)
    if n == 2:
        output_specific_note.print_one_note(notebook)
    if n == 3:
        deleted_note.del_note(notebook)
    if n == 4:
        edition_note.edit_note(notebook)
    if n == 5:
        create_note.making_note(notebook)
    
def save_to_file(notebook):
    with open("file_1.json",'w') as file1:
        json.dump(notebook,file1,indent = 3)



