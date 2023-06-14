from datetime import datetime
import output_specific_note

def making_note(notebook):
    str_keys_into_int = list(map(int,notebook.keys()))       # список ключей (integer)
    next_note = max(str_keys_into_int)+1                     # порядковый номер для ключей при создании записи
    
    notebook[next_note]=list([0,0,0])
    notebook[next_note][1] = input("Дайте название заголовку заметки: ")
    notebook[next_note][2] = input("Теперь создайте саму заметку: ")
    notebook[next_note][0] = datetime.today().strftime("%Y-%m-%d %H часов %M минут %S секунд")

    print("\nВаша заметка стала такой: ")
    output_specific_note.print_one(notebook,next_note)      # вывод заметки
