def containsDuplicate(nums):
    seen = set()
    for num in nums:
        if num in seen:
            return True
        seen.add(num)
    return False

print(containsDuplicate([1, 2, 3, 3]))  # Output: True
print(containsDuplicate([1, 2, 3, 4]))  # Output: False
