from datetime import datetime
import output_specific_note
def making_note(notebook):
    
    next_note = max(notebook.keys())+1
    notebook[next_note]=list([0,0,0])

    notebook[next_note][1] = input("Дайте название заголовку заметки: ")

    notebook[next_note][2] = input("Теперь создайте саму заметку: ")

    notebook[next_note][0] = datetime.today().strftime("%Y-%m-%d %H часов %M минут %S секунд")

    print("\nВаша заметка стала такой: ")
    output_specific_note.print_one(notebook,next_note)


