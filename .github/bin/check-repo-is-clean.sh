#!/usr/bin/env sh

if [ -n "$(git status --untracked-files=no --porcelain)" ]; then
  exit 1
fi