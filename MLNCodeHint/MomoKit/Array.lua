---
--- Generated by MLN Team (https://www.immomo.com)
--- Created by MLN Team.
--- DateTime: 15-01-2020 17:35
---

---
---  数组，提供一个容纳对象的容器，支持string、number、Array、Map类型对象
---
---@note  仅支持string、number、Map、Array类型元素
---@class Array @parent class
---@public field name string 
---@type Array
local _class = {
	_priveta_class_name = "Array"}

---
---  无参数构造方法
---
---@return Array 
function Array()
	return _class
end

---
---  构造方法
---
---@param capacity number  指定初始容量
---@return Array 
function Array(capacity)
	return _class
end

---
---  添加number类型元素
---
---@param number number  被添加到数组的元素
---@return Array 
function _class:add(number)
	return self
end

---
---  添加string类型元素
---
---@param text string  被添加到数组的元素
---@return Array 
function _class:add(text)
	return self
end

---
---  添加Map类型元素
---
---@param map Map  被添加到数组的元素
---@return Array 
function _class:add(map)
	return self
end

---
---  添加Array类型元素
---
---@param array Array  被添加到数组的元素
---@return Array 
function _class:add(array)
	return self
end

---
---  将指定array中所有的元素添加到到当前数组中
---
---@param array Array  要被添加的元素的集合
---@return Array 
function _class:addAll(array)
	return self
end

---
---  移除指定位置的元素
---
---@param index number  要被移除元素的索引
---@return Array 
---@note  元素的索引从1开始
function _class:remove(index)
	return self
end

---
---  从数组中移除某个string类型元素
---
---@param text string  被删除的string类型对象
---@return Array 
function _class:removeObject(text)
	return self
end

---
---  从数组中移除某个number类型元素
---
---@param number number  被删除的number类型对象
---@return Array 
function _class:removeObject(number)
	return self
end

---
---  从数组中移除某个Map类型元素
---
---@param map Map  被删除的Map类型对象
---@return Array 
function _class:removeObject(map)
	return self
end

---
---  从数组中移除某个Array类型元素
---
---@param array Array  被删除的Array类型对象
---@return Array 
function _class:removeObject(array)
	return self
end

---
---  从数组中移除多个元素
---
---@param objects Array  要被删除的元素集合
---@return Array 
function _class:removeObjects(objects)
	return self
end

---
---  从数组中移除多个元素
---
---@param fromIndex number  起始元素索引
---@param toIndex number  结束元素索引
---@return Array 
---@note  元素的索引从1开始
function _class:removeObjectsAtRange(fromIndex, toIndex)
	return self
end

---
---  移除所有元素
---
---@return Array 
function _class:removeAll()
	return self
end

---
---  根据索引获取元素
---
---@param index number  要获取元素的索引
---@return Array 
---@note  元素的索引从1开始
function _class:get(index)
	return self
end

---
---  获取元素个数
---
---@return number 返回元素个数
function _class:size()
	return 0
end

---
---  判断是否包含指定的number类型元素
---
---@param number number  检查的number类型元素
---@return boolean 返回是否包含指定对象
function _class:contains(number)
	return true
end

---
---  判断是否包含指定的string类型元素
---
---@param text string  检查的string类型对象
---@return boolean 返回是否包含指定对象
function _class:contains(text)
	return true
end

---
---  判断是否包含指定的Map类型元素
---
---@param map Map  检查的Map类型对象
---@return boolean 返回是否包含指定对象
function _class:contains(map)
	return true
end

---
---  判断是否包含指定的Array类型元素
---
---@param array Array  检查的Array类型对象
---@return boolean 返回是否包含指定对象
function _class:contains(array)
	return true
end

---
---  将number类型元素插入到指定位置
---
---@param index number  要插入位置的索引
---@param aNumber number  number类型元素
---@return Array 
---@note  元素的索引从1开始
function _class:insert(index, aNumber)
	return self
end

---
---  将string类型元素插入到指定位置
---
---@param index number  要插入位置的索引
---@param aString string  string类型元素
---@return Array 
---@note  元素的索引从1开始
function _class:insert(index, aString)
	return self
end

---
---  将Map类型元素插入到指定位置
---
---@param index number  要插入位置的索引
---@param aMap Map  Map类型元素
---@return Array 
---@note  元素的索引从1开始
function _class:insert(index, aMap)
	return self
end

---
---  将Array类型元素插入到指定位置
---
---@param index number  要插入位置的索引
---@param anArray Array  Array类型元素
---@return Array 
---@note  元素的索引从1开始
function _class:insert(index, anArray)
	return self
end

---
---  向当前数组连续插入多个元素
---
---@param fromIdx number  要插入原数组的起始位置（fromIdx <= array:count()）
---@param subArray Array  要被插入的元素数组
---@return Array 
function _class:insertObjects(fromIdx, subArray)
	return self
end

---
---  将指定索引位置的元素，替换为新的number类型的元素
---
---@param index number  被替换元素索引
---@param newNumber number  用来替换的number类型元素
---@return Array 
function _class:replace(index, newNumber)
	return self
end

---
---  将指定索引位置的元素，替换为新的string类型的元素
---
---@param index number  被替换元素索引
---@param newString string  用来替换的string类型元素
---@return Array 
function _class:replace(index, newString)
	return self
end

---
---  将指定索引位置的元素，替换为新的Map类型的元素
---
---@param index number  被替换元素索引
---@param newMap Map  用来替换的Map类型元素
---@return Array 
function _class:replace(index, newMap)
	return self
end

---
---  将指定索引位置的元素，替换为新的Array类型的元素
---
---@param index number  被替换元素索引
---@param newArray Array  用来替换的Array类型元素
---@return Array 
function _class:replace(index, newArray)
	return self
end

---
---  连续替换当前数组中的多个元素
---
---@param fromIdx number  要替换原数组的开始位置（idx < 原数组count）
---@param newArray Array  用来替换的元素数组（替换数组的count <= 原数组count - fromIdx）
---@return Array 
function _class:replaceObjects(fromIdx, newArray)
	return self
end

---
---  交换两个元素
---
---@param aIndex number  待交换元素的索引
---@param bIndex number  待交换元素的索引
---@return Array 
function _class:exchange(aIndex, bIndex)
	return self
end

---
---  截取子数组
---
---@param startIndex number  截取子数组的起始位置(不包含该值)
---@param b endIndex  截取子数组的结束位置(包含该值)
---@return Array 
function _class:subArray(startIndex, b)
	return self
end

---
---  复制数组
---
---@return array 返回一个和传入的sourceArray内容一样的新数组
function _class:copyArray()
	return array()
end

return _class