---
--- Generated by MLN Team (https://www.immomo.com)
--- Created by MLN Team.
--- DateTime: 15-01-2020 17:35
---

---
---  偏好设置的读写接口
---
---@note  对应iOS系统的NSUserDefault，对应Android的SharePreference
---@class PreferenceUtils @parent class
---@public field name string 
---@type PreferenceUtils
PreferenceUtils= {
	_priveta_class_name = "PreferenceUtils"}

---
---  保存键值对存储数据
---
---@param key string  数据的key
---@param value string  数据的value
---@return PreferenceUtils 
function PreferenceUtils:save(key, value)
	return self
end

---
---  获取指定key存储的value
---
---@param key string  用来获取value的key
---@param default string  如果取不到对应的value，就使用这个默认值
---@return string 对应的值或默认值
function PreferenceUtils:get(key, default)
	return "string"
end

