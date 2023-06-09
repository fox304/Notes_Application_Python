from datetime import datetime
import output_specific_note
def making_note(notebook):
    notebook[10]=list([0,0,0])

    notebook[10][1] = input("Дайте название заголовку заметки: ")

    notebook[10][2] = input("Теперь создайте саму заметку: ")

    notebook[10][0] = datetime.today().strftime("%Y-%m-%d %H часов %M минут %S секунд")

    print("Ваша заметка стала такой: ")
    output_specific_note.print_one(notebook,10)


