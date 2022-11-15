del mccp2-gadap.db
adb -d shell "run-as edu.aku.abdulsajid.smkHhMl2022 cat /data/data/edu.aku.abdulsajid.smkHhMl2022/databases/smkHhMl2022.db > /sdcard/smkHhMl2022.db"
adb pull /sdcard/smkHhMl2022.db.db
"C:\Program Files\Google\Chrome\Application\chrome.exe"  --profile-directory=Default --app-id=bponbdjkefbmgkfiiphhabghkkfocook
@echo Databased Pulled!
