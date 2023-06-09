import print_notes
def del_note(notebook):
    num = int(input("введите номер записи для удаления: "))

    notebook.pop(num)

    print(f"Запись номер {num} удалена.")

    
    print_notes.print_all(notebook)


