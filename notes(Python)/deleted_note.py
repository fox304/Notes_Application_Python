def del_note(notebook):
    num = int(input("введите номер записи для удаления: "))

    notebook.pop(num)
    
    print(f"запись номер {num} удалена ")

    
    print(notebook)







