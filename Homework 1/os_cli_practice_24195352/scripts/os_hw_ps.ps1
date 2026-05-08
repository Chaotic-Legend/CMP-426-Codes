Get-Process |
Sort-Object WorkingSet -Descending |
Select-Object -First 5 ProcessName, Id, WorkingSet

$cwd = Get-Location
$tempDir = Join-Path $cwd "OS_HW_TEMP"

New-Item -ItemType Directory -Path $tempDir -Force

New-Item -ItemType File -Path (Join-Path $tempDir "file1.txt") -Force
New-Item -ItemType File -Path (Join-Path $tempDir "file2.txt") -Force
New-Item -ItemType File -Path (Join-Path $tempDir "file3.txt") -Force
New-Item -ItemType File -Path (Join-Path $tempDir "file4.txt") -Force
New-Item -ItemType File -Path (Join-Path $tempDir "file5.txt") -Force
New-Item -ItemType File -Path (Join-Path $tempDir "file6.txt") -Force
New-Item -ItemType File -Path (Join-Path $tempDir "file7.txt") -Force
New-Item -ItemType File -Path (Join-Path $tempDir "file8.txt") -Force
New-Item -ItemType File -Path (Join-Path $tempDir "file9.txt") -Force
New-Item -ItemType File -Path (Join-Path $tempDir "file10.txt") -Force

Set-Content (Join-Path $tempDir "file1.txt") "This is the OS."
Set-Content (Join-Path $tempDir "file2.txt") "This is the OS."
Set-Content (Join-Path $tempDir "file3.txt") "This is the OS."
Set-Content (Join-Path $tempDir "file4.txt") "This is the OS."
Set-Content (Join-Path $tempDir "file5.txt") "This is the OS."
Set-Content (Join-Path $tempDir "file6.txt") "This is the OS."
Set-Content (Join-Path $tempDir "file7.txt") "This is the OS."
Set-Content (Join-Path $tempDir "file8.txt") "This is the OS."
Set-Content (Join-Path $tempDir "file9.txt") "This is the OS."
Set-Content (Join-Path $tempDir "file10.txt") "This is the OS."

$count = 0
$sum = 0

for ($i = 1; $i -le 50; $i++) {
    if ($i % 3 -eq 0 -and $i % 5 -eq 0) {
        $count++
        $sum += $i
    }
}

"=== DIVISIBLE SUMMARY ==="
"Count: $count"
"Sum: $sum"