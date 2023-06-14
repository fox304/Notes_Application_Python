from datetime import datetime
import errors
import output_specific_note

def edit_note(notebook):
    num = input("введите номер записи для редактирования: ")
    num = errors.err(notebook,num)                            # обработка ошибок
    print("Сейчас запись здесь такая: ")
    output_specific_note.print_one(notebook,num)              # вывод заметки
    
    notebook[num][1] = input("Можете внести  изменения в заголовке: ")
    notebook[num][2] = input("Теперь внесите изменения в заметку: ")
    notebook[num][0] = datetime.today().strftime("%Y-%m-%d %H часов %M минут %S секунд")
    
    print("Отлично, заметка отредактирована ")
    