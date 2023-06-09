from datetime import datetime
import output_specific_note
def edit_note(notebook):
    num = int(input("введите номер записи для редактирования: "))
    print("Сейчас запись здесь такая: ")
    output_specific_note.print_one(notebook,num)
    
    notebook[num][1] = input("Можете внести  изменения в заголовке: ")
    notebook[num][2] = input("Теперь внесите изменения в заметку: ")
    notebook[num][0] = datetime.today().strftime("%Y-%m-%d %H часов %M минут %S секунд")
    
    print("Хорошо, теперь заметка стала такой: ")
    output_specific_note.print_one(notebook,num)

