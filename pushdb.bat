adb push smkHhMl2022.db.db /sdcard/smkHhMl2022.db.db
adb shell "run-as edu.aku.abdulsajid.smkHhMl2022 chmod 666 /data/data/edu.aku.abdulsajid.smkHhMl2022/databases/smkHhMl2022.db
adb shell rm /data/data/edu.aku.abdulsajid.smkHhMl2022/databases/smkHhMl2022.db
adb -d shell "run-as edu.aku.abdulsajid.smkHhMl2022 cat /sdcard/smkHhMl2022.db > /data/data/edu.aku.abdulsajid.smkHhMl2022/databases/smkHhMl2022.db
adb shell "run-as edu.aku.abdulsajid.smkHhMl2022 chmod 600 /data/data/edu.aku.abdulsajid.smkHhMl2022/databases/smkHhMl2022.db
@echo Databased Pulled!