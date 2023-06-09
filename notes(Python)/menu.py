
import json
import print_notes
import output_specific_note
import create_note
import deleted_note
from datetime import datetime
time = datetime.today().strftime("%Y-%m-%d %H часов %M минут %S секунд")

def start_notebook():
    notebook = {'title':{'one':{1:[time,'первая запись'],2:[time,'вторая запись'],3:[time,'третья запись']},
                        'two':{4:[time,'первая запись'],5:[time,'вторая запись'],6:[time,'третья запись'],7:[time,'четвёртая запись']}
                        } 
               }

    with open("file_1.json",'w') as file1:
        json.dump(notebook,file1,indent = 3)
    
    return notebook

def my_menu(notebook):
    
    list_moduls = [print_notes.print_all(notebook)]
    



